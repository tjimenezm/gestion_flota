import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListadoEntregasComponent } from './pages/listado-entregas/listado-entregas.component';
import { PlanificarPedidoComponent } from './pages/planificar-pedido/planificar-pedido.component';
import { ConsultaPedidosComponent } from './pages/consulta-pedidos/consulta-pedidos.component';

const routes: Routes = [
  { path: 'listadoEntregas', component: ListadoEntregasComponent},
  { path: 'planificarPedido', component: PlanificarPedidoComponent},
  { path: 'consultaPedidos', component: ConsultaPedidosComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DespachosRoutingModule { }
