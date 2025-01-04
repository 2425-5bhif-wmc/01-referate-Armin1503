import { Component } from '@angular/core';
import {TranslateService} from '@ngx-translate/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone: false,
  styleUrl: './app.component.css'
})
export class AppComponent {
  username = 'John Doe';

  constructor(private translate: TranslateService) {
    translate.setDefaultLang('de');
  }

  switchLanguage(lang: string) {
    this.translate.use(lang);
  }
}
