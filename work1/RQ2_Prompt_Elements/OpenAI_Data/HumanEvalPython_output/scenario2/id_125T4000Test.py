# id_125_Test.java
from scenario2.id_125 import split_words

import pytest

class id_125_Test:
    """
    Test class of id_125.py.
    It contains ten unit test cases for the :func:`scenario2.id_125.split_words`.
    """


    def test_split_words_1(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("") == 0
		
    def test_split_words_2(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a") == 1
		
    def test_split_words_3(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b") == 2
		
    def test_split_words_4(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c") == 3
		
    def test_split_words_5(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d") == 4
		
    def test_split_words_6(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e") == 5
		
    def test_split_words_7(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f") == 6
		
    def test_split_words_8(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g") == 7
		
    def test_split_words_9(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h") == 8
		
    def test_split_words_10(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i") == 9
		
    def test_split_words_11(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j") == 10
		
    def test_split_words_12(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k") == 11
		
    def test_split_words_13(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l") == 12
		
    def test_split_words_14(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m") == 13
		
    def test_split_words_15(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n") == 14
		
    def test_split_words_16(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o") == 15
		
    def test_split_words_17(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p") == 16
		
    def test_split_words_18(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q") == 17
		
    def test_split_words_19(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r") == 18
		
    def test_split_words_20(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s") == 19
		
    def test_split_words_21(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t") == 20
		
    def test_split_words_22(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u") == 21
		
    def test_split_words_23(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v") == 22
		
    def test_split_words_24(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w") == 23
		
    def test_split_words_25(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x") == 24
		
    def test_split_words_26(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y") == 25
		
    def test_split_words_27(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z") == 26
		
    def test_split_words_28(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A") == 27
		
    def test_split_words_29(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B") == 28
		
    def test_split_words_30(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C") == 29
		
    def test_split_words_31(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D") == 30
		
    def test_split_words_32(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E") == 31
		
    def test_split_words_33(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F") == 32
		
    def test_split_words_34(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G") == 33
		
    def test_split_words_35(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H") == 34
		
    def test_split_words_36(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I") == 35
		
    def test_split_words_37(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J") == 36
		
    def test_split_words_38(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K") == 37
		
    def test_split_words_39(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L") == 38
		
    def test_split_words_40(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M") == 39
		
    def test_split_words_41(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N") == 40
		
    def test_split_words_42(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O") == 41
		
    def test_split_words_43(self):
        """
        Test case for the :func:`scenario2.id_125.split_words`.
        """
        assert split_words("a,b