str = input()
result = ""
for char in str:
    if char.isupper():
        result += char.lower()
    elif char.islower():
        result += char.upper()
print(result)