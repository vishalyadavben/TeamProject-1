export class Student {
    studentId: number;
    firstName: String;
    lastName: String;
    rollNo:number;
    address:String;

    constructor(studentId: number,
        firstName: String,
        lastName: String,
        rollNo:number,
        address:String){
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.rollNo = rollNo;
    }


   
}
