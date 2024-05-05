import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../classes/student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  baseUrl = "http://localhost:8181"
  constructor(private http: HttpClient) { }

  getAllStudent(): Observable<any>{
    return this.http.get<any>(`${this.baseUrl}/student/getStudent`);
  }

  addStudents(studentInfo : Student): Observable<any>{
    return this.http.post<any>(`${this.baseUrl}/student/addStudent`, studentInfo)
  }

  deleteStudent(studentId:number){
    return this.http.delete<any>(`${this.baseUrl}/student/${studentId}`)
  }

  updateStudent(updateStudent: Student):Observable<any>{
    return this.http.put<any>(`${this.baseUrl}/student/updateStudent`, updateStudent);
  }
}
