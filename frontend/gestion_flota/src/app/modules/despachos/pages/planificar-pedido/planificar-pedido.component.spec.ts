import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanificarPedidoComponent } from './planificar-pedido.component';

describe('PlanificarPedidoComponent', () => {
  let component: PlanificarPedidoComponent;
  let fixture: ComponentFixture<PlanificarPedidoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlanificarPedidoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlanificarPedidoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
