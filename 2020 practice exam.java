//https://youtu.be/RB9Ay1iMqTs
// ******************** Question 1 Part A ********************

public int countElectronicsByMaker(String maker) {
  int count = 0;
  for (Gizmo g : purchases) {
    if (g.isElectronic() && g.getMaker().equals(maker))
    count++;
  }
  return count;
}

// ******************** Question 1 Part B ********************

public boolean hasAdjacentEqualPair() {
  for (int i = 1; i < purchases.size(); i++) {
    if (purchases.get(i).equals(purchases.get(i-1))
      return true;
  }
  return false;
}

// ******************** Question 1 Part C ********************

public Gizmo getCheepestGizmoByMaker(String maker)

- Add a private double instance variable price to the Gizmo class that will hold
this Gizmo’s price.
- Add an accessor method public double getPrice() that returns this Gizmo’s
price.
- Modify at least one of the Gizmo’s constructors to take an additional parameter of the
type double and set this Gizmo’s price to the value of that parameter. Alternatively
add a method public void setPrice(double pr) that sets this Gizmo’s price
to pr.
*/

//https://youtu.be/g8Hr05Iv9_k
// ******************** Question 2 Part A ********************

public static boolean isValid(int numWithCheckDigit) {
 return getCheck(numWithCheckDigit/10) == numWithCheckDigit % 10;
}


// ******************** Question 2 Part B ********************

We guess the following answer would earn full credit:

- Add a private static int variable invalidCount to the CheckDigit class.
(Set invalidCount to zero or rely on the default value.)
- Increment invalidCount in the isValid method each time the check digit in the
isValid’s parameter is invalid.
- Add a public static int method getInvalidCount that returns
invalidCount.

The names of the proposed variables and methods are suggestions only.
