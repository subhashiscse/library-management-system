import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.scss']
})
export class BookListComponent implements OnInit {
  bookList =[
    {
      Id: 1,
      BookName: 'The Hobbit',
      AuthorName: 'Author 1',
      Quantity: 'Author 1',
      Price: 'Author 1',
      ImageUrl: 'assets/images/image1.jpg'
    },
    {
      Id: 2,
      BookName: 'The Hobbit',
      AuthorName: 'Author 1',
      Quantity: 'Author 1',
      Price: 'Author 1',
      ImageUrl: 'assets/images/image1.jpg'
    },
    {
      Id: 3,
      BookName: 'The Hobbit',
      AuthorName: 'Author 1',
      Quantity: 'Author 1',
      Price: 'Author 1',
      ImageUrl: 'assets/images/image1.jpg'
    },
    {
      Id: 4,
      BookName: 'The Hobbit',
      AuthorName: 'Author 1',
      Quantity: 'Author 1',
      Price: 'Author 1',
      ImageUrl: 'assets/images/image1.jpg'
    },
    {
      Id: 5,
      BookName: 'The Hobbit',
      AuthorName: 'Author 1',
      Quantity: 'Author 1',
      Price: 'Author 1',
      ImageUrl: 'assets/images/image1.jpg'
    }  
  ] 
  constructor() { }

  ngOnInit(): void {
  }

}
