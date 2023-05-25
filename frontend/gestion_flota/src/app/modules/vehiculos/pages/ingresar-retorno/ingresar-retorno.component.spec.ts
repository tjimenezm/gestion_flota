import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IngresarRetornoComponent } from './ingresar-retorno.component';

describe('IngresarRetornoComponent', () => {
  let component: IngresarRetornoComponent;
  let fixture: ComponentFixture<IngresarRetornoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IngresarRetornoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IngresarRetornoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
