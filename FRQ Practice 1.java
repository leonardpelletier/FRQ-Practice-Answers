//Question 1 Part A

public boolean simulate() {
  int sum = 0;
  for (int i = 0; i < maxHops; i++) {
      sum += hopDistance();
      if (sum < 0) return false;
      if (sum >= goalDistance) return true;
  }
  return false;
}

//Question 1 Part B

public double runSimulations(int n) {
  double sum = 0;
  for (int i = 0; i < n; i++) {
    if (simulate()) {
      sum++;
    }
  }
  return sum/n;
}

//Question 2 Part A

public int nextTankToFill(int threshold) {
  int indexOfLowestTank = filler.getCurrentIdex();
  int lowestFuelValue = threshold + 1;
  for (int i = 0; i < tanks.size(); i++) {
    int currentFuelValue = tanks.get(i).getFuelValue();
    if (currentFuelValue <= threshold && currentFuelValue < lowestFuelValue) {
      indexOfLowestTank = i;
      lowestFuelValue = currentFuelValue;
    }
  }
  return indexOfLowestTank;
}

//Question 2 Part B

public void moveToLocation(int locIndex) {
  int dist = Math.abs(locIndex - filler.getCurrentIndex());
  if (locIndex > filler.getCurrentIndex && !filler.isFacingRight()) {
    filler.changeDirection();
  } else if (locIndex < filler.getCurrentIndex && filler.isFacingRight()) {
    filler.changeDirection();
  }
  filler.moveForward(dist);
}
