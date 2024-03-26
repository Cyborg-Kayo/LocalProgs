sentence = "The quick brown fox jumps over the lazy dog"

# Tokenize the sentence
tokens = sentence.split()

# Iterate over the tokens and print each token along with its index
for index, token in enumerate(tokens):
    print(f"Token {index}: {token}")
