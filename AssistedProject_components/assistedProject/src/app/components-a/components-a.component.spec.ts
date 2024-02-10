import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentsAComponent } from './components-a.component';

describe('ComponentsAComponent', () => {
  let component: ComponentsAComponent;
  let fixture: ComponentFixture<ComponentsAComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ComponentsAComponent]
    });
    fixture = TestBed.createComponent(ComponentsAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
