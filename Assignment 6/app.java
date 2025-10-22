public static void main(String[] args) throws Exception {

        //assinging names, years, grades, and id's to 5 students
        student student1 = new student("Jessica", "Junior", 3.9, 1234);
        student student2 = new student("Derek", "Junior", 2.5, 2345);
        student student3 = new student("Samantha", "Freshman", 2.7, 3456);
        student student4 = new student("Ryan", "Senior", 4.0, 4567);
        student student5 = new student("Gabby", "Sophmore", 3.1, 5678);

        //calling and checking if each student is on honor roll and printing the results
        student1.isHonorRoll();
        student2.isHonorRoll();
        student3.isHonorRoll();
        student4.isHonorRoll();
        student5.isHonorRoll();

        //calling and checking if each student is getting free lunch and printing the results
        student1.isFreeLunch();
        student2.isFreeLunch();
        student3.isFreeLunch();
        student4.isFreeLunch();
        student5.isFreeLunch();
        
    }
}

//Throughout doing this assingment I was reminded that it need to be careful about rememebering to call the method in main
//I was confused why each time I ran the program nothing would run, even though I included print statements until I realized that I was missing the lines where I called the method and ran the if else statement
