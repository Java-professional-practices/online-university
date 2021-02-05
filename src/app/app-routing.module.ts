import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AllUsersComponent } from './all-users/all-users.component';
import { MyheroacademiaComponent } from './myheroacademia/myheroacademia.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';


const routes: Routes = [
  {
    path:"",redirectTo:"myheroacademia", pathMatch:"full"
  },
  {
    path:"search", component:SearchComponent
  },
  {
    path:"all-users", component:AllUsersComponent
  },
  {
    path:"register", component:RegisterComponent
  },
  {
    path:"myheroacademia", component:MyheroacademiaComponent
  },
  {
    path:"**",component:MyheroacademiaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
