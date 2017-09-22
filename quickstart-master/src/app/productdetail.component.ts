import { Component, Input } from '@angular/core';
import { product } from './product';

@Component({
  selector: 'product-detail',
  template: `
  <div class="container">
  <div class="well" style="background-color:#b9b997">
    <div *ngIf="prod">
      <h2>{{prod.name}} details!</h2>
      <div>
        <label>id: </label>{{prod.id}}
      </div>
      <div>
        <label>name: </label>
        <input [(ngModel)]="prod.name" placeholder="name"/>
      </div>
    </div>
    </div>
    </div>
  `
})
export class ProductDetailComponent {
  @Input() prod: product;
}