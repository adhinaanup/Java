import nltk
from nltk.tokenize import sent_tokenize
nltk.download('punkt_tab')
text="Hello, this is Bing.How can I hel?"
sentences=sent_tokenize(text)
print(sentences)

