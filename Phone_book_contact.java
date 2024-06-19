public class Phone_book_contact extends Phone_book {
    public static void main(String[] args) {
        
        Phone_book contact_1 = new Contact(phone_number: "+79268769473"; name: "James"; surname: "McCourty"; second_name: "Din";
        birthDate.of(1965, 5, 21); Status.father; place_of_residence: "Miami, Forest_street, 5"; place_of_work: "Tesla"; comments: "None");
        
        Phone_book contact_2 = new Contact(phone_number: "+79348508391"; name: "Jessica"; surname: "McCoutry"; second_name: "Tom";
        birthDate.of(1965, 10, 5); Status.mother; place_of_residence: "Miami, Forest_street, 5"; place_of_work: "Amazon"; comments: "None");

        Phone_book contact_3 = new Contact(phone_number: "+79646128402"; name: "Alex"; surname: "McCourty"; second_name: "James";
        birthDate.of(1991, 3, 12); Status.brother; place_of_residence: "Miami, Ocean_beach, 25", place_of_work: "IBM"; comments: "None");

        Phone_book contact_4 = new Contact(phone_number: "+79185738584"; name: "Din"; surname: "McCourty"; second_name: "Alan";
        birthDate.of(1938, 6, 14); Status.grandfather; place_of_residence: "Orlando, Sun_Avenue, 14"; place_of_work: "Bank_of_America";
        comments: "None");

        Phone_book contact_5 = new Contact(phone_number: "+79518126392"; name: "Olivia"; surname: "McCourty"; second_name: "Brendon";
        birthDate.of(1939, 11, 27); Status.grandmother; place_of_residence: "Orlando, Sun_Avenue, 14"; place_of_work: Walmart;
        comments: "None");

        Phone_book pb = new myPhone_book();

        //Добавление контакта в телефонную книгу
        pb.addContacts(List.of(contact_1, contact_2, contact_3, contact_4, contact_5));

        System.out.println(pb.getContacts);


    }    
}
