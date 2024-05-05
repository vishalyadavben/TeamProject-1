import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Student } from '../../classes/student';
import { ActivatedRoute, Router } from '@angular/router';
import { StudentService } from '../../services/student.service';

@Component({
  selector: 'app-update-student',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './update-student.component.html',
  styleUrl: './update-student.component.css'
})
export class UpdateStudentComponent {
  existingData!: Student;
  updatedData = new Student(0,'','',0,'')
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private updateService : StudentService
  ) {}
  ngOnInit(){
    this.route.paramMap.subscribe((params) => {
      this.existingData = history.state.studentToUpdate as Student

      console.log(this.existingData)
    })
  }

  updateStudent(){
   
    return this.updateService.updateStudent(this.existingData).subscribe(() => [console.log(this.existingData), this.router.navigate([""])])
  }
}
