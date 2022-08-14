import { TestBed } from '@angular/core/testing';

import { LogindetailsService } from './logindetails.service';

describe('LogindetailsService', () => {
  let service: LogindetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LogindetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
