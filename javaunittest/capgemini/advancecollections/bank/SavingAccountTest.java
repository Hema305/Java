package com.capgemini.advancecollections.bank;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTest {
	private SavingAccount savingaccount1,savingaccount2,savingaccount3,savingaccount4,savingaccount5;
	private BankAccountList savingaccountOne,savingaccountTwo,savingaccountThree,savingaccountFour,savingaccountFive;
	List<SavingAccount> al = new ArrayList<SavingAccount>();
		@Before
		public void setUp(){
			savingaccount1 = new SavingAccount(80000,123,"Hema",true);
			savingaccount2 = new SavingAccount(90000,124,"Latha",false);
			savingaccount3 = new SavingAccount(60000,125,"Bindu",true);
			savingaccount4 = new SavingAccount(19000,126,"Bhanu",false);
			savingaccount5 = new SavingAccount(70000,126,"Chanti",true);
			savingaccountOne = new BankAccountList(80000,123,"Hema",true);
			savingaccountTwo = new BankAccountList(90000,124,"Latha",false);
			savingaccountThree = new BankAccountList(60000,125,"Bindu",true);
			savingaccountFour = new BankAccountList(19000,126,"Bhanu",false);
			savingaccountFive = new BankAccountList(70000,126,"Chanti",true);
	
		}
		
		
		@Test
		public void testForPrintingObjectsThroughArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
				List<SavingAccount> al = new ArrayList<SavingAccount>();
				al.add(savingaccount1);
				al.add(savingaccount2);
				al.add(savingaccount3);
				al.add(savingaccount4);
				al.add(savingaccount5);
		
				for (SavingAccount savingAccount : al) {
					//System.out.println(savingAccount);
				}
				for (SavingAccount savingAccount2 : al) {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\hmotupal\\Desktop\\Java_Assignments\\UnitTesting\\src\\com\\jaha.txt"));
					oos.writeObject(savingAccount2);
					oos.close();
				}
				System.out.println("---------displaying details from reading file--------");
				for (SavingAccount savingAccount2 : al) {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\hmotupal\\Desktop\\Java_Assignments\\UnitTesting\\src\\com\\jaha.txt"));
					SavingAccount savingAccount=(SavingAccount) ois.readObject();
					ois.close();
					System.out.println(savingAccount2+"\n");
				}
		}
		
		@Test
		public void testForPrintingObjectsThroughTreeList() throws FileNotFoundException, IOException, ClassNotFoundException {
				Set<BankAccountList> alist = new TreeSet<BankAccountList>();
				alist.add(savingaccountOne);
				alist.add(savingaccountTwo);
				alist.add(savingaccountThree);
				alist.add(savingaccountFour);
				alist.add(savingaccountFive);
				System.out.println("--------based on account_id without dupictes----------");
				for (BankAccountList savingAccountList : alist) {
					System.out.println(savingAccountList+"\n");
				}

		}
}