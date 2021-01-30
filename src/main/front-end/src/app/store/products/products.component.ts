import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/store/models/product.model';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products: Product[] = [];

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(products => this.products = products);
  }

  reFetch() {
    this.productService.getAllProducts().subscribe(products => this.products = products);
  }

}
