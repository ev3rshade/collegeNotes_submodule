10-21-2025 13:30

Status:

Tags:  

# 📚Lecture 16 MATLAB on a Piecewise Polynomial + Error in Cubic Hermite Interpolation

### MATLAB Script: Piecewise polynomial interpolation
A script demonstrating and comparing two types of piecewise polynomial interpolation: **Cubic Hermite (PCHIP)** and **Cubic Spline**. The code loads infection data (`Covid-inf.mat`) and plots the resulting smooth curves.

```
matlab
%% 💻 Piecewise Polynomial Interpolation - COVID Data Example
% Lecture 16: October 21, 2025
% Demonstrates Cubic Hermite (pchip) and Cubic Spline (spline) interpolation.

%% 1. Setup and Data Loading
% Clear workspace and command window for a clean run
clear
clc

% Load the data file (assuming 'Covid-inf.mat' contains a variable 'C')
load Covid-inf.mat

% Define the x-coordinates (assuming daily data from 1 to 35)
X = (1:35)';

% Check and format the y-coordinates (COVID infection data)
Y = C;

% Check the initial size of the C variable
disp(['Initial size of C: ' num2str(size(C))])

% Transpose Y to ensure it's a column vector for consistency (35x1)
Y = Y';

% Check the size after transposition
disp(['Size of Y after transpose: ' num2str(size(Y))])

% Define the finer x-coordinates for interpolation (step of 0.01)
Xvals = 1:0.01:35;

%% 2. Interpolation
% --- Cubic Hermite Interpolation (PCHIP) ---
% 'pchip' stands for Piecewise Cubic Hermite Interpolating Polynomial.
% It is shape-preserving, meaning it won't overshoot or undershoot.
Hvals = pchip(X, Y, Xvals);

% Check the size of the PCHIP result
disp(['Size of Hvals (pchip): ' num2str(size(Hvals))])
disp(['Max/Min Hvals: ' num2str(max(Hvals)) '/' num2str(min(Hvals))])

% --- Cubic Spline Interpolation ---
% 'spline' computes the natural cubic spline, which yields a smoother curve.
Svals = spline(X, Y, Xvals);

% Check the size of the SPLINE result
disp(['Size of Svals (spline): ' num2str(size(Svals))])
disp(['Max/Min Svals: ' num2str(max(Svals)) '/' num2str(min(Svals))])


%% 3. Plotting and Visualization
figure(1); % Open a new figure window

% Plot the PCHIP interpolation (Blue solid line)
plot(Xvals, Hvals, 'b-', 'LineWidth', 1.5);

% Use 'hold on' to keep the first plot and add subsequent plots
hold on;

% Plot the SPLINE interpolation (Default color line)
plot(Xvals, Svals, 'LineWidth', 1.5);

% Plot the original data points
scatter(X, Y, 50, 'k', 'filled'); % Black filled circles for original points

% Add labels, title, and legend for clarity
title('COVID Data Interpolation: PCHIP vs. Cubic Spline');
xlabel('Day Number');
ylabel('Infection Value (C)');
legend({'PCHIP (Cubic Hermite)', 'Cubic Spline', 'Original Data'}, 'Location', 'best');
grid on;

% Ensure hold is turned off after the figure is complete
hold off;

%% 4. Documentation Note
% For more details on PCHIP, run:
% doc pchip
```

# References