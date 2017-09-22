import { Injectable } from '@angular/core';

import { product } from './product';
import { products } from './mock-product';

@Injectable()
export class ProductService {
  getProducts(): Promise<product[]> {
    return Promise.resolve(products);
  }
  getProductsSlowly(): Promise<product[]> {
    return new Promise(resolve => {
      // Simulate server latency with 2 second delay
      setTimeout(() => resolve(this.getProducts()), 2000);
    });
  }
}