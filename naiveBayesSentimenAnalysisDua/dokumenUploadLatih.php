<?php include("utility/header.php"); ?>

<div class="wrapper">
    <div class="container">
        <!-- Page-Title -->

        <div class="row">


            <div class="col-lg-6">
                <div class="card-box">


                    <h4 class="header-title m-t-0 m-b-30">From Upload Dokumen</h4>

                    <form class="form-horizontal" enctype="multipart/form-data" method="POST" action="controller/terimaDokumenUploadLatih.php">
                        <div class="form-group">
                            <label for="dokumen" class="col-sm-2 control-label">Dokumen
                                *</label>
                            <div class="col-sm-7">
                                <input  type="file" required name="uploadedfile"
                                        class="form-control" id="uploadedfile">

                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Class</label>
                            <div class="col-sm-10">
                                <h6>Pilih Class Salah Satu</h6>
                                <select id="class" name="class" class="form-control">
                                    <option value="1">Positif</option>
                                    <option value="-1">Negatif</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-8">
                                <button type="submit" class="btn btn-primary waves-effect waves-light">
                                    Simpan
                                </button>
                                <button type="reset"
                                        class="btn btn-default waves-effect waves-light m-l-5">
                                    Refresh
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div><!-- end col -->
        </div>
        <!-- end row -->




        <?php include("utility/footer.php"); ?>
