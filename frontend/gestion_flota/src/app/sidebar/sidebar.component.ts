import { Component, OnInit } from '@angular/core';




/* export const ROUTES = [
    { path: '/dashboard',     title: 'Dashboard',         icon:'nc-bank',       class: '' },
    { path: '/icons',         title: 'Icons',             icon:'nc-diamond',    class: '' },
     { path: '/user',          title: 'User Profile',      icon:'nc-single-02',  class: '' }, 
    { path: '/table',         title: 'Vehículos',        icon:'nc-bus-front-12',    class: '', subItems: [
        { path: '/asignarAdministrativo', title: 'Asignar Administrativo', icon: 'nc-badge', class: '' },
        { path: '/solicitarVehiculo', title: 'Solicitar Vehiculo', icon: 'nc-delivery-fast', class: '' },
        { path: '/registrarSalida', title: 'Registrar Salida', icon: 'nc-book-bookmark', class: '' }
      ]},
    { path: '/typography',    title: 'Despachos',        icon:'nc-paper', class: '', subItems: [
        { path: '/icons', title: 'Listado de Entregas', icon: 'nc-paper', class: '' }
      ]}
]; */

export const ROUTES = [
    { path: '/dashboard',     title: 'Dashboard',         icon:'nc-bank',       class: '' },
    { path: '/icons',         title: 'Icons',             icon:'nc-diamond',    class: '' },
    { path: '/asignarAdministrativo', title: 'Asignar Administrativo', icon: 'nc-badge', class: '' },
    { path: '/solicitarVehiculo', title: 'Solicitar Vehiculo', icon: 'nc-delivery-fast', class: '' },
    { path: '/registrarSalida', title: 'Registrar Salida', icon: 'nc-book-bookmark', class: '' },
    { path: '/listadoEntregas', title: 'Listado de Entregas', icon: 'nc-paper', class: '' }
 
];

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
    public menuItems: any[];
    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
    
}
