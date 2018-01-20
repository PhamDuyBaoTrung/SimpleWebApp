import { TestBed, inject } from '@angular/core/testing';

import { DataService } from './data.service';
import {ConnectionBackend, Http, HttpModule} from '@angular/http';

describe('DataService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DataService],
      imports: [HttpModule],
      providers: [Http, ConnectionBackend]
    });
  });

  it('should be created', inject([DataService], (service: DataService) => {
    expect(service).toBeTruthy();
  }));
});
