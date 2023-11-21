import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AppLoginRoutingModule } from './app-login-routing.module';
import { DefaultLoginComponent } from './default-login/default-login.component';
import { AppMaterialModule } from '../app-material/app-material.module';
import { ReactiveFormsModule } from '@angular/forms';
import { SignUpComponent } from './sign-up/sign-up.component';


@NgModule({
  declarations: [
    DefaultLoginComponent,
    SignUpComponent
  ],
  imports: [
    CommonModule,
    AppLoginRoutingModule,
    AppMaterialModule,
    ReactiveFormsModule
  ]
})
export class AppLoginModule { }
