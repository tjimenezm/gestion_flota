import { Routes } from '@angular/router';

import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';

export const AppRoutes: Routes = [
  {
    path: '',
    redirectTo: 'dashboard',
    pathMatch: 'full',
  }, {
    path: '',
    component: AdminLayoutComponent,
    children: [
        {
      path: '',
      loadChildren: () => import('./layouts/admin-layout/admin-layout.module').then(x => x.AdminLayoutModule),
  },
  {
    path: 'vehiculos',
    loadChildren: () => import('./modules/vehiculos/vehiculos.module').then(x => x.VehiculosModule),
  },
  {
    path: 'despachos',
    loadChildren: () => import('./modules/despachos/despachos.module').then(x => x.DespachosModule),
  }
  ]},
  {
    path: '**',
    redirectTo: 'dashboard'
  }
]
