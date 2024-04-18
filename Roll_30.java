import java.util.*;

class firstNameAbsence extends Exception {
    public firstNameAbsence(String message) {
        super(message);
    }
}

class lastNameAbsence extends Exception {
    public lastNameAbsence(String message) {
        super(message);
    }
}

class noNamePresent extends Exception {
    public noNamePresent(String message) {
        super(message);
    }
}

class blankEmailField extends Exception {
    public blankEmailField(String message) {
        super(message);
    }
}

class absenceOfGmailSuffix extends Exception {
    public absenceOfGmailSuffix(String message) {
        super(message);
    }
}

class notProperlyFormatedEmailPrefix extends Exception {
    public notProperlyFormatedEmailPrefix(String message) {
        super(message);
    }
}

class blankNIDPassportField extends Exception {
    public blankNIDPassportField(String message) {
        super(message);
    }
}

class unexpectedNIDFormat extends Exception {
    public unexpectedNIDFormat(String message) {
        super(message);
    }
}

class unexpectedPassportFormat extends Exception {
    public unexpectedPassportFormat(String message) {
        super(message);
    }
}

class wrongBirthdateFormat extends Exception {
    public wrongBirthdateFormat(String message) {
        super(message);
    }
}

class birthdateBlank extends Exception {
    public birthdateBlank(String message) {
        super(message);
    }
}

class addressException extends Exception {
    public addressException(String message) {
        super(message);
    }
}

class addressExceptionP1 extends Exception {
    public addressExceptionP1(String message) {
        super(message);
    }
}

class addressExceptionP2 extends Exception {
    public addressExceptionP2(String message) {
        super(message);
    }
}

class addressExceptionP3 extends Exception {
    public addressExceptionP3(String message) {
        super(message);
    }
}

class person {
    String firstName;
    String middleName;
    String lastName;
    String email;
    String NID;
    String passport;
    String birthdate;
    String address;

    public person(String firstName, String middleName, String lastName, String email, String NID, String passport,
            String birthdate, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.NID = NID;
        this.passport = passport;
        this.birthdate = birthdate;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getNID() {
        return NID;
    }

    public String getPassport() {
        return passport;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void validatePerson(){
        try {
            if (firstName == null || firstName.equals("") ){
                throw new firstNameAbsence("First Name is missing");
            }
            if (lastName == null || lastName.equals("") ){
                throw new lastNameAbsence("Last Name is missing");
            }
            if (firstName == null && lastName == null || firstName.equals("")  && lastName.equals("")) {
                throw new noNamePresent("No Name is present");
            }
            if (email == null || email.equals("")) {
                throw new blankEmailField("Email is missing");
            }
            if (!email.contains("@gmail.com")) {
                throw new absenceOfGmailSuffix("Email does not contain @gmail.com");
            }
            if (!email.matches("^[a-z0-9]+@gmail.com$")) {
                throw new notProperlyFormatedEmailPrefix("Email prefix is not properly formatted");
            }
            if (NID == null && passport == null || NID.equals("")  && passport.equals("") ) {
                throw new blankNIDPassportField("NID and Passport both are missing");
            }
            if (NID != null && !NID.equals("")  && !NID.matches("^[0-9]{11}$")) {
                throw new unexpectedNIDFormat("NID is not properly formatted");
            }
            if (passport != null && !passport.equals("")  && !passport.matches("^[A-Z]{2}[0-9]{7}$")) {
                throw new unexpectedPassportFormat("Passport is not properly formatted");
            }
            if (birthdate == null || birthdate == "") {
                throw new birthdateBlank("Birthdate is missing");
            }
            if (!birthdate.matches("^[0-9]{2} [a-zA-Z]+ [0-9]{4}$")) {
                throw new wrongBirthdateFormat("Birthdate is not properly formatted");
            }
            if (address == null || address.equals("") ) {
                throw new addressException("Address is missing");
            }
            String[] addressParts = address.split(" ");
            if (addressParts.length != 3) {
                throw new addressException("Address is not properly formatted");
            }
            if (!addressParts[0].matches("^[0-9a-zA-Z/]+$")) {
                throw new addressExceptionP1("Address P1 is not properly formatted");
            }
            if (!addressParts[1].matches("^[a-zA-Z ]+$")) {
                throw new addressExceptionP2("Address P2 is not properly formatted");
            }
            if (!addressParts[2].matches("^(Dhaka|Chottogram|Barishal|Khulna|Sylhet|Rajshahi|Mymensingh|Rangpur)$")) {
                throw new addressExceptionP3("Address P3 is not properly formatted");
            }
            System.out.println("valid");
        }
        catch (firstNameAbsence e) {
            System.out.println(e.getMessage());
        }
        catch (lastNameAbsence e) {
            System.out.println(e.getMessage());
        }
        catch (noNamePresent e) {
            System.out.println(e.getMessage());
        }
        catch (blankEmailField e) {
            System.out.println(e.getMessage());
        }
        catch (absenceOfGmailSuffix e) {
            System.out.println(e.getMessage());
        }
        catch (notProperlyFormatedEmailPrefix e) {
            System.out.println(e.getMessage());
        }
        catch (blankNIDPassportField e) {
            System.out.println(e.getMessage());
        }
        catch (unexpectedNIDFormat e) {
            System.out.println(e.getMessage());
        }
        catch (unexpectedPassportFormat e) {
            System.out.println(e.getMessage());
        }
        catch (wrongBirthdateFormat e) {
            System.out.println(e.getMessage());
        }
        catch (birthdateBlank e) {
            System.out.println(e.getMessage());
        }
        catch (addressException e) {
            System.out.println(e.getMessage());
        }
        catch (addressExceptionP1 e) {
            System.out.println(e.getMessage());
        }
        catch (addressExceptionP2 e) {
            System.out.println(e.getMessage());
        }
        catch (addressExceptionP3 e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Roll_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personNumber = sc.nextInt();
        sc.nextLine();
        person[] persons = new person[personNumber];
        for (int i = 0; i < personNumber; i++) {
            System.out.println("Enter First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter Middle Name: ");
            String middleName = sc.nextLine();
            System.out.println("Enter Last Name: ");
            String lastName = sc.nextLine();
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            System.out.println("Enter NID: ");
            String NID = sc.nextLine();
            System.out.println("Enter Passport: ");
            String passport = sc.nextLine();
            System.out.println("Enter Birthdate: ");
            String birthdate = sc.nextLine();
            System.out.println("Enter Address: ");
            String address = sc.nextLine();
            try {
                persons[i] = new person(firstName, middleName, lastName, email, NID, passport, birthdate, address);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            while(true){
            System.out.println("Enter the query: ");
            int query = sc.nextInt();
            if(query == 0)
                break;
            else if(query > 0 && query <= personNumber)
                persons[query - 1].validatePerson();
            else
                System.out.println("Invalid query");
        }
        sc.close();
    }
}