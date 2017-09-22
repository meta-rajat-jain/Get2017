import { Component, OnInit } from '@angular/core';

import { product } from './product';

import { ProductService } from './product.service';

@Component({
  selector: 'my-app',
  template: `
  <div class="container">
  <div class="jumbotron">
  <h2 class="text-center">{{title}}</h2>
  </div>
  <div class="main-content">
  <div class="container">
  <div class="row">
  <div class="col-lg-3 col-md-4 col-xs-6" *ngFor="let product of productArray"
  [class.selected]="product === selectedProduct"
  (click)="onSelect(product)">
  <div class="card">
  <div class="card-header">
  <h3 class="card-title">{{product.name}}</h3>
  </div>
  <div class="card-body">
  <p>
  Product ID: {{product.id}}
  <br>
  Rs. {{product.price}}
  </p>
  </div>
  </div>
  </div>
  </div>
  </div>
  </div>
  </div>
    <product-detail [prod]="selectedproduct"></product-detail>
   
  `,
  styles: [`
  .selected {
    background-color: #CFD8DC !important;
    color: white;
  }
  .card-header {
    display: block;
    background-color: #FFFFFF;
    }
    
    .card {
    display: block;
    border: 2px solid #D0DEF7;
    padding: 10px;
    background-color: #D0DEF7;
    text-align: center;
    box-shadow: 0 0 9px 0px #5a5858;
    margin: 20px;
    transition: transform 1s;
    }
    .card:hover{
    transform :scale(1.1,1.1);
    }
    
    .card-title {
    background-color: #D0DEF7;
    margin-block-start: 0px;
    }
    .jumbotron {
    background-color: #e2f2ff;
    }
    .card-body {
    background-color: #FFFFFF;
    padding: 6px;
    width: 110%;
    margin-left: -5%;
    }
`],
  providers: [ProductService]
})
export class AppComponent implements OnInit {
  title = 'Sopping cart';
  productArray: product[];
  selectedproduct: product;

  constructor(private productservice: ProductService) { }

  getProducts(): void {
    this.productservice.getProducts().then(productArray => this.productArray = productArray);
  }

  ngOnInit(): void {
    this.getProducts();
  }
  onSelect(product: product): void {
    this.selectedproduct = product;
  }
}
