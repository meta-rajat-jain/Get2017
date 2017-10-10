import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Product } from './product';
import { ProductService } from './product.service';

@Component({
    selector: 'my-products',
    templateUrl: './products.component.html',
    styleUrls: [ './products.component.css' ]
  })

  export class ProductsComponent implements OnInit {
      products: Product[];
      selectedProduct: Product;

      constructor(
        private productService: ProductService,
        private router: Router) { }

      getProducts(): void {
        this.productService.getProducts().then(response => {
          this.products = response;
        });
      }

      delete(product: Product): void {
        if ( confirm ('Are you sure to delete the product : ' + product.name )) {
        this.productService
            .delete(product.id)
            .then(() => {
              this.products = this.products.filter(h => h !== product);
              if (this.selectedProduct === product) { this.selectedProduct = null; }
            });
          }
      }

      ngOnInit(): void {
        this.getProducts();
      }

      onSelect(product: Product): void {
        this.selectedProduct = product;
      }

      gotoDetail(product: Product): void {
        console.log(product.id)
        this.router.navigate(['/detail', product.id]);
      }

      gotoAddProduct(): void {
        this.router.navigate(['/addProduct']);
      }

      getProductDetail(): void {
        this.router.navigate(['/getProductDetail', this.selectedProduct.id]);
      }
}
