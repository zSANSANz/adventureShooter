<link media="screen" charset="utf-8" rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/base.css" />
<link media="screen" charset="utf-8" rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/skeleton.css" />
<link media="screen" charset="utf-8" rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/layout.css" />
<link media="screen" charset="utf-8" rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/child.css" />
<link rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/animate.min.css" type="text/css" media="screen" charset="utf-8" />
<link rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/jquery.onebyone.css" type="text/css" media="screen" charset="utf-8" />
<link rel="stylesheet" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/prettyPhoto.css" type="text/css" media="screen" charset="utf-8" />

<link href='<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/popup.css' rel='stylesheet'>
<script src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.min.js"></script>

<script type="text/javascript" language="javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery-1-8-2.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.carousel.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.color.animation.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.prettyPhoto.js" charset="utf-8"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/default.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.onebyone.min.js"></script>
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/jquery.touchwipe.min.js"></script>

<!-- color pickers -->
<link rel="stylesheet" media="screen" type="text/css" href="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/css/colorpicker.css" />
<script type="text/javascript" src="<?php echo base_url()?>assets/Enzyme/eThemes-freebie-Enzyme/Theme/js/colorpicker.js"></script>
<!-- end of color pickers -->

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<link rel="stylesheet" href="<?php echo base_url()?>assets/protectly-web/web/css/prettyPhoto.css" type="text/css" media="screen" charset="utf-8" />

<link href="<?php echo base_url()?>assets/protectly-web/web/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="<?php echo base_url()?>assets/protectly-web/web/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--webfont-->
<script type="text/javascript" src="<?php echo base_url()?>assets/protectly-web/web/js/jquery-1.11.1.min.js"></script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<!-- Add fancyBox main JS and CSS files -->
<script src="<?php echo base_url()?>assets/protectly-web/web/js/jquery.magnific-popup.js" type="text/javascript"></script>
<link href="<?php echo base_url()?>assets/protectly-web/web/css/popup.css" rel="stylesheet" type="text/css">
<script>
    $(document).ready(function() {
        $('.popup-with-zoom-anim').magnificPopup({
            type: 'inline',
            fixedContentPos: false,
            fixedBgPos: true,
            overflowY: 'auto',
            closeBtnInside: true,
            preloader: false,
            midClick: true,
            removalDelay: 300000,
            mainClass: 'my-mfp-zoom-in'
        });
    });
</script>
<!--Animation-->
<script src="<?php echo base_url()?>assets/protectly-web/web/js/wow.min.js"></script>
<link href="<?php echo base_url()?>assets/protectly-web/web/css/animate.css" rel='stylesheet' type='text/css' />
<script>
    new WOW().init();
</script>

<div class="main">
    <div class="content_top">
        <div class="container">

            <div class="wmuSlider example1">
                <div class="wmuSliderWrapper">
                    <form method="post" action="<?php echo base_url() . 'index.php/cSoal/hasilSatu' ?>">

                        <input type="hidden" id="point" name="point" value="3">

                        <?php
                        $i = 1;


                        foreach ($data as $ds) {
//                            $input = array($ds->pilihan_a, $ds->pilihan_b, $ds->pilihan_c, $ds->pilihan_d, $ds->pilihan_e);
//                            $rand_keys = array_rand($input, 5);
//                            echo $input[$rand_keys[0]] . "\n";
//                            echo $input[$rand_keys[1]] . "\n";
//                            echo $input[$rand_keys[2]] . "\n";
//                            echo $input[$rand_keys[3]] . "\n";
//                            echo $input[$rand_keys[4]] . "\n";


                            ?>

                            <article style="position: absolute; width: 100%; opacity: 0;">

                                <div class="banner-wrap">

                                    <table class="table table-form" style="font-size: 16px">
                                        <tr>
                                            <td style="v-align: top"> <?php echo $i; ?></td>
                                            <td colspan="2"><?php echo $ds->deskripsi_soal; ?></td>
                                        </tr>
                                        <tr>
                                            <td width="3%">A.</td>
                                            <td width="3%"><input type="radio" id="soal<?php echo $i; ?>"
                                                                  name="soal<?php echo $i; ?>" value="a"></td>
                                            <td><label><?php echo $ds->pilihan_a; ?></label></td>
                                            </label></tr>
                                        <tr>
                                            <td width="3%">B.</td>
                                            <td width="3%"><input type="radio" id="soal<?php echo $i; ?>"
                                                                  name="soal<?php echo $i; ?>" value="b"></td>
                                            <td><label><?php echo $ds->pilihan_b; ?></label></td>
                                            </label></tr>
                                        <tr>
                                            <td width="3%">C.</td>
                                            <td width="3%"><input type="radio" id="soal<?php echo $i; ?>"
                                                                  name="soal<?php echo $i; ?>" value="c"></td>
                                            <td><label><?php echo $ds->pilihan_c; ?></label></td>
                                            </label></tr>
                                        <tr>
                                            <td width="3%">D.</td>
                                            <td width="3%"><input type="radio" id="soal<?php echo $i; ?>"
                                                                  name="soal<?php echo $i; ?>" value="d"></td>
                                            <td><label><?php echo $ds->pilihan_d; ?></label></td>
                                            </label></tr>
                                        <tr>
                                            <td width="3%">E.</td>
                                            <td width="3%"><input type="radio" id="soal<?php echo $i; ?>"
                                                                  name="soal<?php echo $i; ?>" value="e" ></td>
                                            <td><label><?php echo $ds->pilihan_e; ?>
                                                    <input type="hidden" name="jawaban<?php echo $i; ?>"
                                                           id="jawaban<?php echo $i; ?>"
                                                           value="<?php echo $ds->jawaban_soal; ?>"

                                                </label></td>
                                            </label></tr>
                                    </table>

                                </div>
                            </article>


                            <?php $i++;
                        }
                        ?>




                </div>




                <a class="wmuSliderPrev">Previous</a><a class="wmuSliderNext">Next</a>
            </div>
            <script src="<?php echo base_url()?>assets/protectly-web/web/js/jquery.wmuSlider.js"></script>
            <script>
                $('.example1').wmuSlider();
            </script>

        </div>
    </div>
</div>
</div>

<div class="container">
    <div class="row">
        <div class="col-sm-3 col-md-6">
            <p>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="selesai" class="btn btn-primary ">
                </form>
            </p>
        </div>
    </div>
</div>


