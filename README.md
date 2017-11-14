# sqr
How to calculate square root of number without sqr method in java

this formula used to calculate square root for any number 
                    Xn+1 = Xn-(f(x)/f`(x))
                    
                           to apply it we use prediction for X and try to get root 
                    X0 = number/2
                    X1 = 0.5(X0 + S/X0 )
                    X2 = 0.5(X1 + S/X1 )
                    
                            and so on till you get zero 
                            the last value is the root 
