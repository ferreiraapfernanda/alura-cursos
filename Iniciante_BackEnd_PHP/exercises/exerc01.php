<?php

/**
 * função somaArray
 *
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
