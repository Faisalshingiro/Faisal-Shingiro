#!/bin/bash

echo "Which main class do you want to run?"
echo "1. Main1 (SiteManager)"
echo "2. Main2 (HotelManager)"
echo "3. Main3 (TrafficFineSystem)"
read choice

case $choice in
  1) java case_study.Q1.SiteManager ;;
  2) java case_study.Q2.HotelManager ;;
  3) java case_study.Q3.TrafficFineSystem ;;
  *) echo "Invalid choice" ;;
esac
