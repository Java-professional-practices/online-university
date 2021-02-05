import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-myheroacademia',
  templateUrl: './myheroacademia.component.html',
  styleUrls: ['./myheroacademia.component.scss']
})
export class MyheroacademiaComponent implements OnInit {
  banner = "/assets/images/banner.png";
  youtubefront = "/assets/images/youtube_1.jpeg";
  allvideos = "/assets/images/youtube_2.png";
  instagram = "/assets/images/instagram_1.png";
  aditya = "assets/images/aditya.jpg";
  abhisheak = "assets/images/abhisheak.jpg";
  vineeta = "assets/images/vineeta.jpg";
  ankush = "assets/images/ankush.jpg";

  constructor() { }

  ngOnInit() {
  }

}
