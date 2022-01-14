package printLetterAtoZ;

public class letterAtoZ {

	
		public int r = 5, c = 5, i, j;

		void A() {
			int r = 5, c = 5, i, j;
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || j == c - 1 || i == r / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void B() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || j == c - 1 || i == r / 2 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void C() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void D() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 1 || i == r - 1 || j == c - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void E() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || i == r / 2 || i == r - 1)

						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void F() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || i == r / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void G() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == 0 || i == r / 2 || i == r - 1 || i >= r / 2 && j == c - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void H() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i == r / 2 || j == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void I() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == c / 2 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void J() {
			System.out.println(" ");
			for (i = 0; i < r; i++)

			{
				for (j = 0; j < c; j++) {
					if (i == 0 || j == c / 2 || i == r - 1 && j < c / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void K() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i + j == 2 || i - j == 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void L() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void M() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || j == c - 1 || (i == j && i < 3) || (i + j == r - 1 && i < 2))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void N() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i == j || j == c - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}

		}

		void O() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i == 0 || j == c - 1 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void P() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || i == 0 || i == r / 2 || (j == c - 1 && i < 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void q() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == c - 1 || i == 0 || i == r / 2 || (j == 0 && i < 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void R() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || (i == 0 && j < c - 3) || (i == r / 2 && j < c - 2) || (j == c - 3 && i < 3)
							|| i - j == 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void S() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || i == r - 1 || i == r / 2 || (j == 0 && i < 3) || (j == c - 1 && i > r / 2))
						System.out.print("*");
					else

						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void T() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i == 0 || j == c / 2)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void U() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || j == c - 1 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void V() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if ((i == j && i < 3) || (i + j == r - 1 && i < 2))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void W() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (j == 0 || j == c - 1 || (i + j == 4 && i > 1 && j < 3) || (i == j && i >= 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void X() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++)

				{
					if (i == j || i + j == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void y() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i + j == r - 1 || (i == j && i < 3))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

		void Z() {
			System.out.println(" ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					if (i + j == r - 1 || i == 0 || i == r - 1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println(" ");
			}
		}
		void z()
		{
			int k=5;
	        for(int i=0;i<5;i++,--k)
	        {
	            for(int j=0;j<5;j++)
	            {
	                 if(i>1 && i<5)
	                 {
	                     if(j==k)
	                     System.out.print("*");
	                 }
	                 else
	                System.out.print("*");
	            }
	           
	            System.out.println("");
	        }
		}

	public static void main(String[] args)
	{
	// new letter().a();
		letterAtoZ pr=new letterAtoZ();
	pr.A();
	pr.B();
	pr.C();
	pr.D();
	pr.E();
	pr.F();
	pr.G();
	pr.H();
	pr.I();
	pr.J();
	pr.K();
	pr.L();
	pr.M();
	pr.N();
	pr.O();
	pr.P();
	pr.q();
	pr.R();
	pr.S();
	pr.T();
	pr.U();
	pr.V();
	pr.W();
	pr.X();
	pr.y();
	pr.Z();
	pr.z();
	}
	
}
