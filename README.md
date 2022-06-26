# WEB-3.0
ASSIGNMENT 2 SOLIDITY :
1. COPY PASTE ASSIGNMENT2.sol on a solidity compliler.
2. use "reqLoan" function to request loan from the owner.
3. Functions viewDues and settleDues are only accesible by owner.

SAMPLE TEST CASE :
reqLoan(10000,2,2) // 10000 is principle amount, 2 is time taken in years, 2 is annual rate of interest.
loans[creditor adderess] will view the amount of loan.
viewDues and settleDues which allow *ONLY* the owner to *view* and *settle* his loans respectively.
after using settle dues 
owner's balance will be=(100000-10404).
