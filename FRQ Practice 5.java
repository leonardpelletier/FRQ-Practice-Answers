//Question 1A

public Digits(int num) {
  digitList = new ArrayList<Integer>();
  if (num == 0) {
    digitList.add(new Integer(0));
  }
  while (num > 0) {
    digitList.add(0, new Integer(num % 10));
    num /= 10;
  }
}

//Question 1B

public boolean isStrictlyIncreasing() {
  for (int i = 0; i < digitList.size()-1; i++) {
    if (digitList.get(i).intValue() >= digitList.get(i+1).intValue()) {
      return false;
    }
  }
  return true;
}
