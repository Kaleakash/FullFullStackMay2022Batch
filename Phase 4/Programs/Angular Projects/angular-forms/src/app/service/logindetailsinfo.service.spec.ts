import { TestBed } from '@angular/core/testing';

import { LogindetailsinfoService } from './logindetailsinfo.service';

describe('LogindetailsinfoService', () => {
  let service: LogindetailsinfoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LogindetailsinfoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
