import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DefaultLoginComponent } from './default-login/default-login.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    component: DefaultLoginComponent
  },
  {
    path: 'login',
    pathMatch: 'full',
    component: DefaultLoginComponent
  },
  {
    path: 'signup',
    component: SignUpComponent
  }
];
@NgModule({
  imports: [
    RouterModule.forChild(routes),
  ],
  exports: [RouterModule]
})
export class AppLoginRoutingModule { }
