> Models that learn from ==INPUT (X) -> OUTPUT (Y) ==
> Learns from given the "right answer"
- examples
	- email -> spam? (0/1) | spam filtering
	- audio -> text transcripts | speech recognition
	- image/radar -> position of other cars/objects | self-driving car

### 1. Regression
> Predict a ==number== when there are ==infinitely many== outputs

Predict values based off of a regression on a graph (A PRELABELED DATASET with X and Y values)

![[Pasted image 20250317104007.png]]

### 2. Classification
>Classifying an input into a category (class)
>==Limited outputs== - BIGGEST DIFFERENCE FROM REGRESSION

#### Input - there can be more than 1
- example - age and tumor size of a patient
- more inputs that are relevant = more accurate predictions
#### Class / category - the output of the model
- example - benign or malignant tumor

#### Boundary Line
- What the model uses to separate data points to classify them correctly

![[Pasted image 20250317103944.png]]