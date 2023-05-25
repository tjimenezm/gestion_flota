import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DespachosRoutingModule } from './despachos-routing.module';
import { ListadoEntregasComponent } from './pages/listado-entregas/listado-entregas.component';
import { PlanificarPedidoComponent } from './pages/planificar-pedido/planificar-pedido.component';
import { ConsultaPedidosComponent } from './pages/consulta-pedidos/consulta-pedidos.component';


@NgModule({
  declarations: [
    ListadoEntregasComponent,
    PlanificarPedidoComponent,
    ConsultaPedidosComponent
  ],
  imports: [
    CommonModule,
    DespachosRoutingModule
  ]
})
export class DespachosModule { }
