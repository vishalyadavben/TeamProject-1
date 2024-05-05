import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';
import { Student } from '../../classes/student';
import { error } from 'console';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NavigationExtras ,Router } from '@angular/router';

@Component({
  selector: 'app-student',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent {
  studentData : Student[] = [];
  AddStudent = new Student(0,'','',0,'');
  constructor(private studentService: StudentService, private router : Router){}

  ngOnInit(){
   this.getAllStudent();
  }

  getAllStudent(){
    return this.studentService.getAllStudent().subscribe((data) => [this.studentData = data, console.log(data)]), 
    (error: any) => {
      console.log(error)
    }
  }

  addStudent(){
    this.studentService.addStudents(this.AddStudent).subscribe(() => [alert("Added STUDENTS !"), console.log(this.AddStudent), this.getAllStudent(), this.AddStudent = new Student(0,'','',0,'')]),
    (error:any) => {
      console.log(error);
    }
    
  }
  
  deleteStudent(studentId:number){
    this.studentService.deleteStudent(studentId).subscribe(() => [alert("Student Deleted"), console.log(studentId), this.getAllStudent()])
    ,
    (error:any) => {
      console.log(error);
    }
  }

  updateStudent(studentToUpdate: Student){
    const navigationExtras: NavigationExtras = {
      state: { studentToUpdate}
    };
    console.log(studentToUpdate);
    this.router.navigate(['updateStudent'], navigationExtras);
  }



}
