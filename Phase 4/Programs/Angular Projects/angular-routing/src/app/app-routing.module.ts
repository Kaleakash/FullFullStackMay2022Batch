import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { ContactusComponent } from './contactus/contactus.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DisplaycomponentComponent } from './displaycomponent/displaycomponent.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { LoginComponent } from './login/login.component';

// we have to write set of rules to nagivate the 
// component base upon the path. 
// http://localhost:4200 
const routes: Routes = [
{path:"aboutus",component:AboutusComponent},
{path:"contactus",component:ContactusComponent},
{path:"feedback",component:FeedbackComponent},
{path:"login",component:LoginComponent},
{path:"dashboard",component:DashboardComponent,children:[

  {path:"addproduct",component:AddproductComponent},
  {path:"displayproduct",component:DisplaycomponentComponent}
  
]

}

];

// sub module 
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
