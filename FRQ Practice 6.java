//Question 1A

public void replaceNthOccurrence(String str, int n, String repl) {
  int loc = findNthOccurrence(str, n);
  if (loc != -1) {
    currentPhrase = currentPhrase.substring(0, loc) + repl + currentPhrase.substring(loc + str.length());
  }
}

//Question 1B

public int findLastOccurrence(String str) {
  int n = 1;
  while (findNthOccurrence(str, n+1) != -1) {
    n++;
  }
  return findNthOccurrence(str, n);
}
