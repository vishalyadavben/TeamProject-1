import { Routes } from '@angular/router';
import { StudentComponent } from './components/student/student.component';
import { UpdateStudentComponent } from './components/update-student/update-student.component';

export const routes: Routes = [

    {path: "", component: StudentComponent},
    {path: "updateStudent", component: UpdateStudentComponent}


];
