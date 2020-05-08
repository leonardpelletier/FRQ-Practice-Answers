//Question 1 Part A

public int countNotInVocab(String[] wordArray) {
   int sum = 0;
   for (String word : wordArray) {
      if (!findWord(word)) {
        sum++;
      }
   }
   return sum;
}

//Question 1 Part B
public String[] notInVocab (String[] wordArray) {
  String[] answer = new String[countNotInVocab(wordArray)];
  int i = 0;
  for (String word : wordArray) {
     if (!findWord(word)) {
        answer[i] = word;
        i++;
     }
  }
  return answer;
}

//Question 2

public static int divBySum(int[] arr, int num) {
  int sum = 0;
  for (int n : arr) {
    if (n % num == 0) {
      sum++;
    }
  }
  return sum;
}
