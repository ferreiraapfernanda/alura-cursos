<?php

/**
 * função somaArray
 *
 * @link https://cursos.alura.com.br/course/php-mysql-e-fundamentos-da-web/task/4019
 * @author Fernanda Aparecida
 * @param [array] $array
 * @return [float] Somatória dos valores presentes no array
 */
function somaArray($array){

    $somatoria = 0;

    foreach($array as $elem){
        $somatoria += (float) $elem;
    }

    return $somatoria;
}


?>
