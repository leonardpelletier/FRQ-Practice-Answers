//Question 1A

public DownloadInfo getDownloadInfo (String title) {
  for (DownloadInfo info : downloadList) {
    if (info.getTitle().equals(title)) {
      return info;
    }
  }
  return null;
}

//Question 1B

public void updateDownloads (List<String> titles) {
  for (String title : titles) {
    DownloadInfo DL = getDownloadInfo(title);
    if (DL == null) {
      downloadList.add(new DownloadInfo(title));
    } else {
      DL.incrementTimesDownloaded();
    }
  }
}

//Question 2A

public TokenPass(int playerCount) {
  board = new int[playerCount];
  for (int i = 0; i < playerCount; i++) {
    board[i] = (int) (Math.random() * 10) + 1;
  }
  currentPlayer = (int) (playerCount * Math.random());
}

//Question 2B

public void distributeCurrentPlayerTokens() {
  int nextPlayer = currentPlayer;
  int numToDistribute = board[currentPlayer];
  board[currentPlayer] = 0;

  while (numToDistrbute > 0) {
      nextPlayer = currentPlayer + 1;
      if (nextPlayer == board.length) {
        nextPlayer = 0;
      }
      board[nextPlayer]++;
      numToDistribute--;
  }
}
