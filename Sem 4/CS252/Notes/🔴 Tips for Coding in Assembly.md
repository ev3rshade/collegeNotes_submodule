Opened 01-28-2026 08:52

Status:

Tags:

# Tips for Coding in Assembly

If you use register arguments to store temporal values in your computations, remember they can
be overwritten when you make a function call.

Example:
Store something into %rsi, %rdi or any other register argument.
call printf # This may overwrite %rsi, %rdi or other reg arguments.

Solutions:
1. Push register arguments before call and pop them after the call. Make sure to push in pairs to keep the stack aligned to 16 bytes.
2. Do not use register arguments. Use callee saved instead. Just push the old value before function starts and pop them when function returns.

# References