// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */
// package com.game.map;

// /**
//  *
//  * @author lpela
//  */
// public class Draw extends MapTextures {    

//     public void topWall(int x, int y) {
//         batch.draw(wall, x, y + 1);
//         batch.draw(wall, x, y + 32);
//         batch.draw(wallTop, x, y + 64);
//         batch.draw(plaster, x, y + 80);
//     }

//     public void rightWall(int x, int y) {
//         batch.draw(wall, x + 1, y);
//         batch.draw(wallTop, x + 24, y);
//         batch.draw(plaster, x + 40, y);
//     }

//     public void leftWall(int x, int y) {
//         batch.draw(wallTop, x, y);
//         batch.draw(floor, x + 16, y);
//     }

//     public void bottomWall(int x, int y) {
//         batch.draw(wallTop, x, y);
//         batch.draw(floor, x, y + 16);
//     }

//     static public void drawFloor(int x, int y) {
//         batch.draw(floor, x, y);
//     }

//     public void cornerTopRight(int x, int y) {
//         batch.draw(wall, x, y);
//         batch.draw(wall, x, y + 32);
//         batch.draw(wallTop, x + 24, y);
//         batch.draw(wallTop, x + 24, y + 32);
//         batch.draw(wallTop, x, y + 64);
//         batch.draw(plaster, x + 40, y);
//         batch.draw(plaster, x + 40, y + 32);
//         batch.draw(plaster, x + 40, y + 64);
//         batch.draw(plaster, x + 40, y + 80);
//         batch.draw(plaster, x, y + 80);
//         batch.draw(plaster, x + 32, y + 80);
//     }

//     public void cornerBottomRight(int x, int y) {
//         batch.draw(wallTop, x, y);
//         batch.draw(wall, x, y + 16);
//         batch.draw(wallTop, x + 24, y);
//         batch.draw(plaster, x + 32, y);
//     }

//     public void cornerTopLeft(int x, int y) {
//         batch.draw(wallTop, x, y);
//         batch.draw(wallTop, x, y + 32);
//         batch.draw(wall, x + 16, y);
//         batch.draw(wall, x + 16, y + 32);
//         batch.draw(wallTop, x, y + 64);
//         batch.draw(plaster, x, y + 80);
//     }

//     public void cornerBottomLeft(int x, int y) {
//         batch.draw(wallTop, x, y);
//         batch.draw(floor, x + 16, y + 16);
//     }
    
//     public 

// }
