# MutationTesting

Mutation Testing with Hand Written mutants.

# What is Mutation Testing?

  Mutation Testing is a type of software testing where we mutate (change) certain statements in the source code and check if the test cases are able to find the errors. It is a type of white box testing which is mainly used for unit testing. The changes in mutant program are kept extremely small, so it does not affect the overall objective of the program.
  
# Mutation Operators

  There are two types of mutation operators:
  
  1. Class level mutation operators
  2. Method level mutation operators


# Equivelant Mutant 
    The mutant whose introduced change does not modify the meaning of the original program.
# Higher Order Mutant
    Higher order mutants are created by the insertion of two or more faults

# Operators [Class Level Operators Only]

    These Below Operators shows Equivalant Result

* PCI (Type Cast Operator Insertion)
* PCD (Type Cast Operator Deletion)
* PPD (Parameter Variable Declaration with Child Class type)
* IHD (Hiding Varaiable Deletion)
* IHI (Hiding Varaiable Insertion)
* JDC (Java Supported Default Constructor Deletion)
* AMC (Access Modifier Change)

      These Below Opertor shows Not Equivalant Result :

* JTD (This Keyword Deletion)
* JTI (This Keyword Insertion)
* IOR (Overriding Method Rename)
* ISD (Super Keyword Deletion)
* IOD (Overriding Method Deletion)
* IOP (Overriding Method Calling Position)
* SDL (Statement Deletion) [Method Level Operator]
