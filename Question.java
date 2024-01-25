package com.bldea.crorepatiapp.package1; 
 
import java.util.Scanner; 
 
public class Question { 
static String result; 
static String result2; 
static int count_life_line = 3; 
static int aud_phn = 1; 
static int cnt_50_50 = 1; 
static int skip_cnt=1; 
static Scanner sc = new Scanner(System.in); 
 
public static boolean fetchQuestion1(String name) throws Exception { 
System.out.println("1. Who is the founder of Java?"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n" + "e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(1000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(1000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(1000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(1000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 87%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(1000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 87%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" 
+ "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println( 
"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("d")) { 
Candidate.setAmount(1000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
 
public static boolean fetchQuestion2(String name) throws Exception{ 
System.out.println("2. Who is the captain of RCB?"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n" 
+ "e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("b) Maxwell\n" + 
"c) Faf duplesis\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(2000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("b) Maxwell\n" + 
"c) Faf duplesis\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("b) Maxwell\n" + 
"c) Faf duplesis\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(2000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} 
else 
{ 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} 
else { 
return false; 
} 
} 
} 
// --- need code intervention 
} 
} 
else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Virat\n" + 
"b) Maxwell\n" + 
"c) Faf duplesis\n" + 
"d) Chahal\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(2000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion3(String Name) throws InterruptedException { 
System.out.println("3. Which of these is a gas giant planet?"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Jupiter\n" + "d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(5000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(5000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Jupiter\n" + "d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Jupiter\n" + "d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(5000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(5000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(5000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Jupiter\n" + "d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Jupiter\n" + "d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Jupiter\n"+ 
"b) Venus\n"+ 
"c) Mercury\n"+ 
"d) Mars\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion4(String Name) throws InterruptedException { 
System.out.println("4. Whuch of these synonym for 'Happy'?"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Joyful\n"+ "d) Scared"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(10000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Joyful\n"+ 
"d) Scared"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Joyful\n"+ 
"d) Scared"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(10000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) J.J Thompson\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Joyful\n"+ 
"d) Scared"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Sad\n"+ 
"b) Angry\n"+ 
"c) Joyful\n"+ 
"d) Scared\n");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion5(String Name) throws InterruptedException { 
System.out.println("5. How many continents are there in the world?"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(20000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(20000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println( "c) Ambros Flaming\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(20000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(20000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(20000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) 5\n"+ 
"b) 6\n"+ 
"c) 7\n"+ 
"d) 8"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion6(String Name) throws InterruptedException { 
System.out.println("6. Which of these ia a musical instrument ?"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Flute\n"+ 
"b) Spoon"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(20000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(80000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(20000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork");  
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println( "a) Flute\n"+ 
"b) Spoon\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(80000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(80000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork");  
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(80000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork");  
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Flute\n"+ 
"b) Spoon\n"+ 
"c) Knife\n"+ 
"d) Fork"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(80000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion7(String Name) throws InterruptedException { 
System.out.println("7. Which of these is a unit of length?"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(500000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(500000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println( "c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(500000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(500000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(500000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius");  
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Kilogram\n"+ 
"b) Liter\n"+ 
"c) Meter\n"+ 
"d) Celsius"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(500000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion8(String Name) throws InterruptedException { 
System.out.println("8. Who is father of Mathematics?"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Archimedes\n"+ 
"b) Charles Babbage\n"+ 
"c) Thomas Edison\n"+ 
"d) James Gosling"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion9(String Name) throws InterruptedException { 
System.out.println("9. Who is captain of indian cricket team?"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni\n"+ 
"e)Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli"); result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(5000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(5000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(2000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(2000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Virat Kohli\n"+ 
"c) Rishab Pant\n"+ 
"d) Dhoni"); 
result = sc.next(); 
if (result.equalsIgnoreCase("a")) { 
Candidate.setAmount(5000000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
public static boolean fetchQuestion10(String Name) throws InterruptedException { 
System.out.println("10. Who is Captain of CSK?"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell\n"+ 
"e) Life_line"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else if (result.equalsIgnoreCase("e")) { 
if (count_life_line > 0) { 
count_life_line--; 
System.out.println("Available Life lines:\n" + "a. Audience Poll\n" + "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result2 = sc.next(); 
if (result2.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out 
.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50\n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available)\n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} else if (result2.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println( "c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 -- (not available) \n" + "c. skip"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
 
else if (result2.equalsIgnoreCase("c")) { 
if (skip_cnt != 0) { 
skip_cnt = 0; 
Candidate.setAmount(10000000); 
return true; 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" + "b. 50-50 \n" 
+ "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result3 = sc.next(); 
if (result3.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println( 
"option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("Available Life lines:\n" + "a. Audience Poll -- (not available) \n" 
+ "b. 50-50 \n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
// --- need code intervention 
} 
} else if (result3.equalsIgnoreCase("b")) { 
if (cnt_50_50 != 0) { 
cnt_50_50 = 0; 
System.out.println("Select the options"); 
System.out.println("c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
// 
System.out.println("Available Life lines:\n" + "a. Audience Poll \n" 
+ "b. 50-50 -- (not available)\n" + "c. skip -- (not available)"); 
System.out.println("Select the life line:"); 
String result4 = sc.next(); 
if (result4.equalsIgnoreCase("a")) { 
if (aud_phn != 0) { 
aud_phn = 0; 
Thread.sleep(10000); 
System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" 
+ "option d = 7%"); 
System.out.println("Select the option"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else { 
return false; 
} 
} else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} else 
return false; 
} 
} 
} 
} 
} 
} 
} 
// changes in line 122 
else { 
System.out.println("You have no life line left. Please select an option:"); 
System.out.println("a) Rohit Sharma\n"+ 
"b) Faf Duplesis\n"+ 
"c) Dhoni\n"+ 
"d) Maxwell"); 
result = sc.next(); 
if (result.equalsIgnoreCase("c")) { 
Candidate.setAmount(10000000); 
return true; 
} 
} 
 
} 
 
return false; 
} 
} 